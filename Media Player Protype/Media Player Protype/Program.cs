using AxWMPLib;
using System;
using System.IO;
using System.Threading;
using WMPLib; // Windows Media Player Library

class Program
{
    static WindowsMediaPlayer mediaPlayer;

    static void Main(string[] args)
    {
        mediaPlayer = new WindowsMediaPlayer();

        Console.WriteLine("Simple Media Player");
        Console.WriteLine("1. Play Audio");
        Console.WriteLine("2. Play Video");
        Console.WriteLine("3. Pause");
        Console.WriteLine("4. Resume");
        Console.WriteLine("5. Stop");
        Console.WriteLine("6. Exit");

        bool exit = false;
        while (!exit)
        {
            Console.Write("Enter your choice: ");
            int choice = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine();

            switch (choice)
            {
                case 1:
                    PlayAudio();
                    break;
                case 2:
                    PlayVideo();
                    break;
                case 3:
                    Pause();
                    break;
                case 4:
                    Resume();
                    break;
                case 5:
                    Stop();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    Console.WriteLine("Invalid choice. Please try again.\n");
                    break;
            }
        }
    }

    static void PlayAudio()
    {
        Console.Write("Enter audio file path: ");
        string filePath = Console.ReadLine();

        if (File.Exists(filePath))
        {
            mediaPlayer.URL = filePath;
            mediaPlayer.controls.play();
            Console.WriteLine("Playing audio...\n");
        }
        else
        {
            Console.WriteLine("File not found.\n");
        }
    }

    static void PlayVideo()
    {
        Console.Write("Enter video file path: ");
        string filePath = Console.ReadLine();

        if (File.Exists(filePath))
        {
            mediaPlayer.URL = filePath;
            mediaPlayer.controls.play();
            Console.WriteLine("Playing video...\n");

            // Wait for the video to finish playing
            while (mediaPlayer.playState == WMPPlayState.wmppsPlaying)
            {
                Thread.Sleep(1000);
            }

            Console.WriteLine("Video playback completed.\n");
        }
        else
        {
            Console.WriteLine("File not found.\n");
        }
    }

    static void Pause()
    {
        mediaPlayer.controls.pause();
        Console.WriteLine("Playback paused.\n");
    }

    static void Resume()
    {
        mediaPlayer.controls.play();
        Console.WriteLine("Playback resumed.\n");
    }

    static void Stop()
    {
        mediaPlayer.controls.stop();
        Console.WriteLine("Playback stopped.\n");
    }
}
