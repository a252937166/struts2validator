package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by OyDn on 2016/5/9.
 */
public class UserAction extends ActionSupport{
    private String username;
    private String password;
    private String mobile;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String login() {
        System.out.println("执行了login");
        return "success";
    }
    public String update() {
        System.out.println("执行了update");
        return "success";
    }

//    @Override
//    public void validate() {
//        if (username==null || "".equals(username)) {
//            this.addFieldError("username","用户名不能为空");
//        }
//        if (password==null || "".equals(password)) {
//            this.addFieldError("password","密码不能为空");
//        }
//        if (mobile==null || "".equals(mobile)) {
//            this.addFieldError("mobile","手机号不能为空");
//        }
//    }

}
