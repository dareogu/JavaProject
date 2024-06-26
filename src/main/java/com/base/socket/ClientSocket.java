package com.base.socket;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket {
  public static void main(String[] args) throws Exception {
    Socket s = new Socket("127.0.0.1", 6666);

    OutputStream os = s.getOutputStream();
    DataOutputStream dos = new DataOutputStream(os);

    dos.writeUTF("hello server!");

    dos.flush();
    dos.close();
    s.close();
  }
}
