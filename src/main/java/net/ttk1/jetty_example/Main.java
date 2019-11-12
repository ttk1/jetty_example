package net.ttk1.jetty_example;

import net.ttk1.jetty_example.servlet.HogeServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(3000);
        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(HogeServlet.class, "/");
        server.setHandler(handler);
        server.start();
    }
}
