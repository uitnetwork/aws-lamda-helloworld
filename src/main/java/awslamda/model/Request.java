package awslamda.model;

/**
 * Created by ninhdoan on 6/10/17.
 */
public class Request {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" + "name='" + name + '\'' + '}';
    }
}
