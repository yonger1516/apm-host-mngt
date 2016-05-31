package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@ThriftService("ContainerMngtService")
public interface ContainerMngtService
{
    @ThriftService("ContainerMngtService")
    public interface Async
    {
        @ThriftMethod(value = "getQueue")
        ListenableFuture<Void> getQueue();
    }
    @ThriftMethod(value = "getQueue")
    void getQueue() throws org.apache.thrift.TException;
}