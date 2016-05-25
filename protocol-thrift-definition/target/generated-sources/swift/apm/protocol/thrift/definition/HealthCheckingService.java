package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@ThriftService("HealthCheckingService")
public interface HealthCheckingService
{
    @ThriftService("HealthCheckingService")
    public interface Async
    {
        @ThriftMethod(value = "heartBeat")
        ListenableFuture<Void> heartBeat();
    }
    @ThriftMethod(value = "heartBeat")
    void heartBeat() throws org.apache.thrift.TException;
}