/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

/**
 *
 * @author Acer
 */
public class main {
     public static void main(String[] args) {
        //1. Pick a URL from the frontier
        new WebCrawler().getPageLinks("http://www.goolge.com");
    }
    
}
