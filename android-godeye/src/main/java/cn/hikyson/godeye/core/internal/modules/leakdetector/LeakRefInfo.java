package cn.hikyson.godeye.core.internal.modules.leakdetector;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import java.io.Serializable;
import java.util.Map;

@Keep
public class LeakRefInfo implements Serializable {

    private final boolean excludeRef;
    @Nullable
    private final Map<String, String> extraInfo;

    public LeakRefInfo(boolean excludeRef, @Nullable Map<String, String> extraInfo) {
        this.excludeRef = excludeRef;
        this.extraInfo = extraInfo;
    }

    @Nullable
    public Map<String, String> getExtraInfo() {
        return extraInfo;
    }

    public boolean isExcludeRef() {
        return excludeRef;
    }

    @Override
    public String toString() {
        return "LeakRefInfo{" +
                ", excludeRef=" + excludeRef +
                ", extraInfo=" + extraInfo +
                '}';
    }
}
