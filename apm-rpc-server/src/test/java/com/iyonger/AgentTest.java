package com.iyonger;

import apm.protocol.thrift.definition.AgentInfo;
import apm.protocol.thrift.definition.HealthCheckingService;
import apm.protocol.thrift.definition.HelloService;
import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.service.ThriftClientManager;
import org.apache.thrift.TException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;

import static com.google.common.net.HostAndPort.fromParts;

/**
 * Created by yongfu on 5/25/2016.
 */
public class AgentTest {
    ThriftClientManager thriftClientManager;

    @BeforeClass
    public void setup(){
         thriftClientManager = new ThriftClientManager();
    }

    @Test
    public void test1(){
        HealthCheckingService service = null;
        try {
            service = thriftClientManager.createClient(
                    new FramedClientConnector(fromParts("localhost", 12345)),
                    HealthCheckingService.class).get();

            AgentInfo info=new AgentInfo();
            info.setHostId("host123");
            service.heartBeat(info);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test2(){
        HealthCheckingService service = null;
        try {
            service = thriftClientManager.createClient(
                    new FramedClientConnector(fromParts("localhost", 12345)),
                    HealthCheckingService.class).get();

            AgentInfo info=new AgentInfo();
            info.setHostId("host456");
            service.heartBeat(info);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }


    }
}
