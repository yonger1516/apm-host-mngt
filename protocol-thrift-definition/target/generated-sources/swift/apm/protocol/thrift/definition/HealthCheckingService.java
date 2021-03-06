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
        ListenableFuture<Void> heartBeat(
            @ThriftField(value=1, name="info", requiredness=Requiredness.NONE) final AgentInfo info
        );
    }
    @ThriftMethod(value = "heartBeat")
    void heartBeat(
        @ThriftField(value=1, name="info", requiredness=Requiredness.NONE) final AgentInfo info
    ) throws org.apache.thrift.TException;
}