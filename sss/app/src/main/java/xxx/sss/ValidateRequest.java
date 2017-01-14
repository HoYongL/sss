package xxx.sss;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 회원id 체크 (중복불가능하기위해)
 */

public class ValidateRequest extends StringRequest {

    final static private String URL = "http://xxx.raonnet.com/UserValidate.php";
    private Map<String, String>parameters;

    public ValidateRequest(String userID,  Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);


    }


    @Override
    public  Map<String, String>getParams(){
        return parameters;

    }

}
