package tw.com.web.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ImageTools {
		private static String imagePath;
		public static void setImagePath(String path) {
			imagePath = path;
		}
		public static String getImagePath() {
			return imagePath;
		}
		
		public static boolean uploadFile(InputStream inpuStr,
				String fileName) throws FileNotFoundException, IOException {
				String fileDir = Paths.get(getImagePath(), fileName).toString();
				try(BufferedInputStream bfIn = new BufferedInputStream(inpuStr);
					FileOutputStream out = new FileOutputStream(fileDir)){
					byte[] cache = new byte[1024];
					int index = -1;
					while( (index = bfIn.read()) != -1) {
						out.write(cache,0,index);
					}
				}
			return true;
		}
		
		public static List<String> getImageFileNames() throws IOException {
			Path filePath = Paths.get(imagePath);
			List<String> list =  Files.list(filePath).
					map(p->p.getFileName().toString()).
			  collect(Collectors.toList());
			return list;
		}
}
