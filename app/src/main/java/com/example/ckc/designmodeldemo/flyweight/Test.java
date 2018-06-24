package com.example.ckc.designmodeldemo.flyweight;

public class Test {
    public static void main(String [] args){
        Ticket ticketOne= TicketFactory.getTicket("苏州","上海");
        ticketOne.showTicketInfo("上铺");
        Ticket ticketTwo= TicketFactory.getTicket("苏州","上海");
        ticketTwo.showTicketInfo("下铺");
        Ticket ticketThree= TicketFactory.getTicket("苏州","上海");
        ticketThree.showTicketInfo("站票");
    }
}
