package com.tech.dsa;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<Void, Void, Void> {
    Socket socket;
    DataOutputStream dataOutputStream;
    PrintWriter printWriter;
    private int port = 9090;

    @Override
    protected Void doInBackground(Void... voids) {

        try {
            socket = new Socket("192.168.49.50",port);
            OutputStream outputStream = socket.getOutputStream();



        }catch (Exception e){
            e.printStackTrace();
        }




        return null;
    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
    }
}
