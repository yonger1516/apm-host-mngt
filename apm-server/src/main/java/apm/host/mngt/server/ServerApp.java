package apm.host.mngt.server;

import apm.protocol.thrift.definition.HelloService;
import com.facebook.nifty.core.NettyServerConfig;
import com.facebook.nifty.core.ThriftServerDef;
import com.facebook.swift.codec.ThriftCodecManager;
import com.facebook.swift.service.ThriftEventHandler;
import com.facebook.swift.service.ThriftServer;
import com.facebook.swift.service.ThriftServiceProcessor;
import com.google.common.collect.ImmutableList;
import org.apache.thrift.TException;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * Created by bob on 16/5/24.
 */
public class ServerApp {

    public static void main(String[] args) {

        NettyServerConfig nettyServerConfig = NettyServerConfig.newBuilder()
                .setBossThreadExecutor(newCachedThreadPool())
                .setWorkerThreadExecutor(newCachedThreadPool())
                .build();

        ThriftServiceProcessor processor = new ThriftServiceProcessor(new ThriftCodecManager(), ImmutableList.<ThriftEventHandler>of(), new HelloService() {
            @Override
            public String ping() throws TException {
                return "pong";
            }
        });

        ThriftServerDef thriftServerDef = ThriftServerDef.newBuilder()
                .listen(12345)
                .withProcessor(processor)
                .using(newFixedThreadPool(1))
                .build();

        final ThriftServer thriftServer = new ThriftServer(nettyServerConfig, thriftServerDef);
        System.out.println("server is listen in 12345 port");
        thriftServer.start();

        // Arrange to stop the server at shutdown
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                thriftServer.close();
            }
        });
    }

}