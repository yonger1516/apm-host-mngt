namespace java apm.protocol.thrift.definition
namespace java.swift apm.protocol.thrift.definition

service ConfigurationService {
     //Configuration getConfiguation();
     string getConfigurationVersion()
     void reportConfiguration()
}
