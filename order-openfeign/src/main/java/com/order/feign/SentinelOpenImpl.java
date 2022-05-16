package com.order.feign;

import org.springframework.stereotype.Component;

/**
 * @author 黄小爷
 * @description
 */
@Component
public class SentinelOpenImpl implements SentinelOpen{
    public String reduce2() {
        return "降级了";
    }

    @Override
    public String reduce() {
        return "降级了";
    }
}
