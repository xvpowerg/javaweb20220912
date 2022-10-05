package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tw.com.net.MaskNetTools;
import tw.com.beans.Mask;
import tw.com.json.MaskJsonTools;

@WebServlet(urlPatterns= {"/mask"},asyncSupported = true)
public class MaskServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			AsyncContext ctx = req.startAsync();
			
			MaskNetTools.getMaskJson(result->{
				try {
					MaskJsonTools.maskJsonToObj(result, maskList->{
						//System.out.println(maskList);
			
						try {
							ServletRequest newRequest =  ctx.getRequest();
							ServletResponse newResponse = ctx.getResponse();
							
							newRequest.setAttribute("maskList", maskList);
							System.out.println("Thread:"+Thread.currentThread().getName());
							newRequest.getRequestDispatcher("/mask.jsp").
										forward(newRequest, newResponse);
							
							
						} catch (ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						ctx.complete();
					});
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
		}
}
