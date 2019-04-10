package priv.huke.provider;

import priv.huke.common.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        return "Hello Dubbo!" + name;
    }

    @Override
    public String doFirst() {
        System.out.println("执行提供者的doFirst");
        return "doFirst";
    }

    @Override
    public String doSecond() {
        System.out.println("doSecond");
        return "doSecond";
    }
}
