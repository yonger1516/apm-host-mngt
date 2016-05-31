namespace java apm.protocol.thrift.definition
namespace java.swift apm.protocol.thrift.definition

struct AgentInfo {
    1:string host_id;
    2:HostStats host_stats;
    3:string last_response_hash;
    4:ProcessStat process_stat;
    5:string status_hash;
    6:double total_cpu;
    7:i32 version;
}

struct ProcessStat {
    1:double cpu_percent;
    2:i32 id;
    3:double rss;
    4:double system_cpu_time;
    5:double user_cpu_time;
    6:double vms;
    7:i64 wallclock_time;
}

struct HostStats {
    1:double load_avg;
    2:map<string,i64> mountpoint;
    3:double physical_memory_total;
    4:double physical_memory_used;
    5:double virtual_memory_total;
    6:double virtual_memory_used;

}