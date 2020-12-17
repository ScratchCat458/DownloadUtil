# ScratchCat458 DownloadUtil
Simple file downloading utility written in Java.

## Prerequisites
- DownloadUtil .jar
- Java IDE

## Setup for IntelliJ
1. Open a new or existing project
2. Add the DownloadUtil .jar in Module Settings under Dependencies in modules
3. Create a folder in src called _output
4. Run the following example code
```
import com.scratchcat458.util.DownloadUtil;

public static void main(String[] args) {
    DownloadUtil d = new DownloadUtil();

    d.download("YOUR_FILE_URL", "YOUR_FILE_NAME.with_file_extension");
    // OR
    d.downloadFromConsoleInput();
}
```
5. Navigate to the *_output* in src to check if the file has been downloaded
