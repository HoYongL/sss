package xxx.sss;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 로그인 요청을 받을수 있는 request
 */

public class LoginRequest extends StringRequest {

    final static private String URL = "http://xxx.raonnet.com/UserLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword,  Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);


    }


    @Override
    public  Map<String, String>getParams(){
        return parameters;

    }

}
