package tw.com.net;
import java.io.IOException;
import java.util.function.Consumer;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class MaskNetTools {
	private final static String MASK_URL ="https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json" ;

	public static void getMaskJson(Consumer<String> callback) {
		
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request okRequest = new Request.Builder().url(MASK_URL).build();
		Call call =   client.newCall(okRequest);
		call.enqueue(new Callback() {

			@Override
			public void onFailure(Call arg0, IOException arg1) {
				// TODO Auto-generated method stub
				System.out.println("Failure:"+arg1);
			}
			
			@Override
			public void onResponse(Call arg0, Response respon) throws IOException {
				// TODO Auto-generated method stub
				String result = respon.body().string();
				callback.accept(result);
			}
			
			
		});
		
	}
}
