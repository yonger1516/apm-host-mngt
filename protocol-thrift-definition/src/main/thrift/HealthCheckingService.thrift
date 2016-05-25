namespace java apm.protocol.thrift.definition
namespace java.swift apm.protocol.thrift.definition

service HealthCheckingService{
    void heartBeat(AgentInfo info)
}
