package com.sunbeaminfo.invoice.tester;
import com.sunbeaminfo.invoice.calc.*;
public class Tester {

	public static void main(String[] args) {
		Invoice invoice=new Invoice();
		invoice.accept();
		invoice.calculateInvoice();
		invoice.setDescription("varnier calliper");
		invoice.setPartNumber(1122);
		invoice.setQuantity(10);
		invoice.setPrice(150.00);
		System.out.println(invoice.getDescription());
		System.out.println(invoice.getPartNumber());
		System.out.println(invoice.getQuantity());
		System.out.println(invoice.getPrice());
		invoice.calculateInvoice();

	}

}
