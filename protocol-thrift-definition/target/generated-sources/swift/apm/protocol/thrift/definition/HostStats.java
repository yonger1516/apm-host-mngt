package apm.protocol.thrift.definition;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.Objects.toStringHelper;

@ThriftStruct("HostStats")
public final class HostStats
{
    public HostStats() {
    }

    private double loadAvg;

    @ThriftField(value=1, name="load_avg", requiredness=Requiredness.NONE)
    public double getLoadAvg() { return loadAvg; }

    @ThriftField
    public void setLoadAvg(final double loadAvg) { this.loadAvg = loadAvg; }

    private Map<String, Long> mountpoint;

    @ThriftField(value=2, name="mountpoint", requiredness=Requiredness.NONE)
    public Map<String, Long> getMountpoint() { return mountpoint; }

    @ThriftField
    public void setMountpoint(final Map<String, Long> mountpoint) { this.mountpoint = mountpoint; }

    private double physicalMemoryTotal;

    @ThriftField(value=3, name="physical_memory_total", requiredness=Requiredness.NONE)
    public double getPhysicalMemoryTotal() { return physicalMemoryTotal; }

    @ThriftField
    public void setPhysicalMemoryTotal(final double physicalMemoryTotal) { this.physicalMemoryTotal = physicalMemoryTotal; }

    private double physicalMemoryUsed;

    @ThriftField(value=4, name="physical_memory_used", requiredness=Requiredness.NONE)
    public double getPhysicalMemoryUsed() { return physicalMemoryUsed; }

    @ThriftField
    public void setPhysicalMemoryUsed(final double physicalMemoryUsed) { this.physicalMemoryUsed = physicalMemoryUsed; }

    private double virtualMemoryTotal;

    @ThriftField(value=5, name="virtual_memory_total", requiredness=Requiredness.NONE)
    public double getVirtualMemoryTotal() { return virtualMemoryTotal; }

    @ThriftField
    public void setVirtualMemoryTotal(final double virtualMemoryTotal) { this.virtualMemoryTotal = virtualMemoryTotal; }

    private double virtualMemoryUsed;

    @ThriftField(value=6, name="virtual_memory_used", requiredness=Requiredness.NONE)
    public double getVirtualMemoryUsed() { return virtualMemoryUsed; }

    @ThriftField
    public void setVirtualMemoryUsed(final double virtualMemoryUsed) { this.virtualMemoryUsed = virtualMemoryUsed; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("loadAvg", loadAvg)
            .add("mountpoint", mountpoint)
            .add("physicalMemoryTotal", physicalMemoryTotal)
            .add("physicalMemoryUsed", physicalMemoryUsed)
            .add("virtualMemoryTotal", virtualMemoryTotal)
            .add("virtualMemoryUsed", virtualMemoryUsed)
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

        HostStats other = (HostStats)o;

        return
            Objects.equals(loadAvg, other.loadAvg) &&
            Objects.equals(mountpoint, other.mountpoint) &&
            Objects.equals(physicalMemoryTotal, other.physicalMemoryTotal) &&
            Objects.equals(physicalMemoryUsed, other.physicalMemoryUsed) &&
            Objects.equals(virtualMemoryTotal, other.virtualMemoryTotal) &&
            Objects.equals(virtualMemoryUsed, other.virtualMemoryUsed);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            loadAvg,
            mountpoint,
            physicalMemoryTotal,
            physicalMemoryUsed,
            virtualMemoryTotal,
            virtualMemoryUsed
        });
    }
}
