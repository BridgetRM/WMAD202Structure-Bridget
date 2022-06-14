package ca.ciccc.wmad.assignment2.question8;

public class question8 {
    public static void main(String[] args) {
        int nThrows = 0;
        int nSuccess = 0;

        double x, y;

        for (int i = 0; i < 100 ; i++)
        {
            x = Math.random();
            y = Math.random();

            nThrows++;

            if ( x*x + y*y <= 1 )
                nSuccess++;
        }

        System.out.println("Pi with 100 tries =  " + 4*(double)nSuccess/(double)nThrows );
        for (int i = 0; i < 1000 ; i++)
        {
            x = Math.random();
            y = Math.random();

            nThrows++;

            if ( x*x + y*y <= 1 )
                nSuccess++;
        }

        System.out.println("Pi with 1000 tries = " + 4*(double)nSuccess/(double)nThrows );
        for (int i = 0; i < 10000 ; i++)
        {
            x = Math.random();
            y = Math.random();

            nThrows++;

            if ( x*x + y*y <= 1 )
                nSuccess++;
        }

        System.out.println("Pi with 10000 tries =  " + 4*(double)nSuccess/(double)nThrows );
    }
}
