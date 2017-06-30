package io.teradata.glw.jmx;

/**
 * Created by gw186023 on 6/28/17.
 */
public interface HelloMBean {
    public void setMessage(String message);
    public String getMessage();
    public void sayHello();
}
