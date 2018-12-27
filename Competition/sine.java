import java.util.Scanner;
import java.io.*;
public class sine
{
    public static void main(String[]args) throws Exception
    {
        Scanner sc = new Scanner(new File("sine.in"));
        PrintWriter fout = new PrintWriter(new File("sine.out"));
        int Amptop = sc.nextInt();
        int Ampbot = sc.nextInt();
        if(Amptop < Ampbot)
        {
            int temp = Amptop;
            Amptop = Ampbot;
            Ampbot = temp;
        }
        int Freqtop = sc.nextInt();
        int Freqbot = sc.nextInt();
        if(Freqtop < Freqbot)
        {
            int temp = Freqtop;
            Freqtop = Freqbot;
            Freqbot = temp;
        }
        int sinewaves = sc.nextInt();
        boolean[]sin = new boolean[sinewaves];
        for(int x = 0; x < sinewaves; x++)
        {
            sin[x] = true;
            int Amps = sc.nextInt();
            int[]amps = new int[Amps];
            for(int y = 0; y < Amps; y++)
            {
                amps[y] = sc.nextInt();
                if(amps[y] < Ampbot || amps[y] > Amptop)
                {
                    sin[x] = false;
                }
            }
            int Freq = sc.nextInt();
            int[]freq = new int[Freq];
            for(int y = 0; y < Freq; y++)
            {
                freq[y] = sc.nextInt();
                if(freq[y] < Freqbot || freq[y] > Freqtop)
                {
                    sin[x] = false;
                }
            }
            if(sin[x]) fout.println("Sine Wave " + (x + 1) + " is GOOD");
            else fout.println("Sine Wave " + (x + 1) + " is BAD");
        }
        fout.close();
    }
}
