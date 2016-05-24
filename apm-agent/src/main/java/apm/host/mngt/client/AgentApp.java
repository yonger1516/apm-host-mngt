package apm.host.mngt.client;

import apm.protocol.thrift.definition.HelloService;
import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.service.ThriftClientManager;

import static com.google.common.net.HostAndPort.fromParts;

/**
 * Created by bob on 16/5/24.
 */
public class AgentApp {

    public static void main(String[] args) throws Exception {

        ThriftClientManager thriftClientManager = new ThriftClientManager();
        HelloService helloService = thriftClientManager.createClient(
                new FramedClientConnector(fromParts("localhost", 12345)),
                HelloService.class).get();
        System.out.println(helloService.ping());

        int max = 10000;
        Long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            helloService.ping();
        }
        Long end = System.currentTimeMillis();
        Long elapse = end - start;
        int perform = Double.valueOf((max / elapse / 1000d)).intValue();
        System.out.println("thrift " + max + " times invoke, spend " + elapse + " millisecond,average is " + perform + " times per second");

    }
}
