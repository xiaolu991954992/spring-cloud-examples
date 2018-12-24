package cn.rankey.springcloud.remote;

import cn.rankey.springcloud.remote.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Primary
@FeignClient(name="spring-cloud-producer22",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
