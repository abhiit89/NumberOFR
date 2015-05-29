import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abhinnag on 5/20/2015.
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        String message = null;

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(bfr.readLine());
        while(T>0)
        {
            {
                message = bfr.readLine().toUpperCase();

                int start = message.indexOf('K');
                int last = message.lastIndexOf('K');

                if(last<=message.length())
                {
                    for(int i = start;i<=last;i++)
                    {
                        if(message.charAt(i) == 'K')
                        {
                            message.replace('K','R');
                        }
                        else
                        {
                            if(message.charAt(i) == 'R')
                            {
                                message.replace('K','R');
                            }
                        }
                    }
                }

                int rcount=0;

                for(int i = 0;i<message.length();i++)
                {
                    if(message.charAt(i) == 'R')
                    {
                        rcount++;
                    }
                    else
                        continue;
                }

                System.out.println(rcount);

            }
            T--;
        }
    }
}
