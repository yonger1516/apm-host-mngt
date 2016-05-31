package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@ThriftService("ConfigurationService")
public interface ConfigurationService
{
    @ThriftService("ConfigurationService")
    public interface Async
    {
        @ThriftMethod(value = "getConfigurationVersion")
        ListenableFuture<String> getConfigurationVersion();

        @ThriftMethod(value = "reportConfiguration")
        ListenableFuture<Void> reportConfiguration();
    }
    @ThriftMethod(value = "getConfigurationVersion")
    String getConfigurationVersion() throws org.apache.thrift.TException;

    @ThriftMethod(value = "reportConfiguration")
    void reportConfiguration() throws org.apache.thrift.TException;
}