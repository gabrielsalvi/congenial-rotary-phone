package threads;

public class ThreadExample
{
    public static void main(String[] args)
    {
        PdfGenerator generatePdf = new PdfGenerator();
        LoadingBar loadingBar = new LoadingBar(generatePdf);

        generatePdf.start();
        loadingBar.start();
    }
}

class PdfGenerator extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("PDF fully generated!");
    }
}

class LoadingBar extends Thread
{
    private Thread generatePdf;

    public LoadingBar(Thread generatePdf)
    {
        this.generatePdf = generatePdf;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(500);

                if (!generatePdf.isAlive()){
                    break;
                }

                System.out.println("Generating...");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}