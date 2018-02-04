import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DynamicMethodDispatch {

    public static void main(String[] args) throws Exception {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the blog from where you want to read:\n"
                + "1) MyReader\n" + "2) AnotherReader\n" + "3) LastReader\n");
        int choice = Integer.parseInt(read.readLine());
        Reader blogReader = null;
        switch(choice) {
            case 1:
                blogReader = new MyReader();
                break;
            case 2:
                blogReader = new AnotherReader();
                break;
            case 3:
                blogReader = new LastReader();
                break;
            default:
                System.out.println("Please select a valid number.");
        }

        if(blogReader != null)
            blogReader.readFromBlog();
    }
}

class Reader {

    public void readFromBlog() {
        System.out.println("Reading from any blog.");
    }
}

class MyReader extends Reader {

    public void readFromBlog() {
        System.out.println("Reading from MyReader");
    }
}

class AnotherReader extends Reader {

    public void readFromBlog() {
        System.out.println("Reading from AnotherBlog");
    }
}

class LastReader extends Reader {

    public void readFromBlog() {
        System.out.println("Reading from LastReader");
    }
}


