package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.Objects.toStringHelper;

@ThriftStruct("AgentInfo")
public final class AgentInfo
{
    public AgentInfo() {
    }

    private String hostId;

    @ThriftField(value=1, name="host_id", requiredness=Requiredness.NONE)
    public String getHostId() { return hostId; }

    @ThriftField
    public void setHostId(final String hostId) { this.hostId = hostId; }

    private HostStats hostStats;

    @ThriftField(value=2, name="host_stats", requiredness=Requiredness.NONE)
    public HostStats getHostStats() { return hostStats; }

    @ThriftField
    public void setHostStats(final HostStats hostStats) { this.hostStats = hostStats; }

    private String lastResponseHash;

    @ThriftField(value=3, name="last_response_hash", requiredness=Requiredness.NONE)
    public String getLastResponseHash() { return lastResponseHash; }

    @ThriftField
    public void setLastResponseHash(final String lastResponseHash) { this.lastResponseHash = lastResponseHash; }

    private ProcessStat processStat;

    @ThriftField(value=4, name="process_stat", requiredness=Requiredness.NONE)
    public ProcessStat getProcessStat() { return processStat; }

    @ThriftField
    public void setProcessStat(final ProcessStat processStat) { this.processStat = processStat; }

    private String statusHash;

    @ThriftField(value=5, name="status_hash", requiredness=Requiredness.NONE)
    public String getStatusHash() { return statusHash; }

    @ThriftField
    public void setStatusHash(final String statusHash) { this.statusHash = statusHash; }

    private double totalCpu;

    @ThriftField(value=6, name="total_cpu", requiredness=Requiredness.NONE)
    public double getTotalCpu() { return totalCpu; }

    @ThriftField
    public void setTotalCpu(final double totalCpu) { this.totalCpu = totalCpu; }

    private int version;

    @ThriftField(value=7, name="version", requiredness=Requiredness.NONE)
    public int getVersion() { return version; }

    @ThriftField
    public void setVersion(final int version) { this.version = version; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("hostId", hostId)
            .add("hostStats", hostStats)
            .add("lastResponseHash", lastResponseHash)
            .add("processStat", processStat)
            .add("statusHash", statusHash)
            .add("totalCpu", totalCpu)
            .add("version", version)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AgentInfo other = (AgentInfo)o;

        return
            Objects.equals(hostId, other.hostId) &&
            Objects.equals(hostStats, other.hostStats) &&
            Objects.equals(lastResponseHash, other.lastResponseHash) &&
            Objects.equals(processStat, other.processStat) &&
            Objects.equals(statusHash, other.statusHash) &&
            Objects.equals(totalCpu, other.totalCpu) &&
            Objects.equals(version, other.version);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            hostId,
            hostStats,
            lastResponseHash,
            processStat,
            statusHash,
            totalCpu,
            version
        });
    }
}
