package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.Objects.toStringHelper;

@ThriftStruct("ProcessStat")
public final class ProcessStat
{
    public ProcessStat() {
    }

    private double cpuPercent;

    @ThriftField(value=1, name="cpu_percent", requiredness=Requiredness.NONE)
    public double getCpuPercent() { return cpuPercent; }

    @ThriftField
    public void setCpuPercent(final double cpuPercent) { this.cpuPercent = cpuPercent; }

    private int id;

    @ThriftField(value=2, name="id", requiredness=Requiredness.NONE)
    public int getId() { return id; }

    @ThriftField
    public void setId(final int id) { this.id = id; }

    private double rss;

    @ThriftField(value=3, name="rss", requiredness=Requiredness.NONE)
    public double getRss() { return rss; }

    @ThriftField
    public void setRss(final double rss) { this.rss = rss; }

    private double systemCpuTime;

    @ThriftField(value=4, name="system_cpu_time", requiredness=Requiredness.NONE)
    public double getSystemCpuTime() { return systemCpuTime; }

    @ThriftField
    public void setSystemCpuTime(final double systemCpuTime) { this.systemCpuTime = systemCpuTime; }

    private double userCpuTime;

    @ThriftField(value=5, name="user_cpu_time", requiredness=Requiredness.NONE)
    public double getUserCpuTime() { return userCpuTime; }

    @ThriftField
    public void setUserCpuTime(final double userCpuTime) { this.userCpuTime = userCpuTime; }

    private double vms;

    @ThriftField(value=6, name="vms", requiredness=Requiredness.NONE)
    public double getVms() { return vms; }

    @ThriftField
    public void setVms(final double vms) { this.vms = vms; }

    private long wallclockTime;

    @ThriftField(value=7, name="wallclock_time", requiredness=Requiredness.NONE)
    public long getWallclockTime() { return wallclockTime; }

    @ThriftField
    public void setWallclockTime(final long wallclockTime) { this.wallclockTime = wallclockTime; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("cpuPercent", cpuPercent)
            .add("id", id)
            .add("rss", rss)
            .add("systemCpuTime", systemCpuTime)
            .add("userCpuTime", userCpuTime)
            .add("vms", vms)
            .add("wallclockTime", wallclockTime)
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

        ProcessStat other = (ProcessStat)o;

        return
            Objects.equals(cpuPercent, other.cpuPercent) &&
            Objects.equals(id, other.id) &&
            Objects.equals(rss, other.rss) &&
            Objects.equals(systemCpuTime, other.systemCpuTime) &&
            Objects.equals(userCpuTime, other.userCpuTime) &&
            Objects.equals(vms, other.vms) &&
            Objects.equals(wallclockTime, other.wallclockTime);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            cpuPercent,
            id,
            rss,
            systemCpuTime,
            userCpuTime,
            vms,
            wallclockTime
        });
    }
}
