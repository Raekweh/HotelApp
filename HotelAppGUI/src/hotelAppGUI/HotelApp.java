/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

/**
 *
 * @author Raymond Li
 */
public class HotelApp 
{
    public static void main(String[] args) 
    {
        View view = new View();
        Model model = new Model();
        Controller controls = new Controller(view, model);
        model.addObserver(view);
    }
}