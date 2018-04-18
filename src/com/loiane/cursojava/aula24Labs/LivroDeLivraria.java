package com.loiane.cursojava.aula24Labs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class LivroDeLivraria {

	public static void main(String[] args) {
		
		DateFormat datef = new SimpleDateFormat("dd/mm/yyyy");
		Date dateRelease;
		Book LivroDeLivraria = new Book();
		
		LivroDeLivraria.bookAuthor = "Dmitry Glukhovsky";
		LivroDeLivraria.bookCategory = "Science Fiction";
		LivroDeLivraria.bookFormat = "paperback";
		LivroDeLivraria.bookName = "Metro 2033";
		LivroDeLivraria.bookPrice = 60.55;
		LivroDeLivraria.bookPublisher = "Orion Publishing Group";
		LivroDeLivraria.bookRelease = "09/June/2011";
		
		System.out.println("Book: " + LivroDeLivraria.bookName);
		System.out.println("Author: " + LivroDeLivraria.bookAuthor);
		System.out.println("Category: " + LivroDeLivraria.bookCategory);
		System.out.println("Format: " + LivroDeLivraria.bookFormat);
		System.out.println("Price: " + LivroDeLivraria.bookPrice);
		System.out.println("Publisher: " + LivroDeLivraria.bookPublisher);
		System.out.println("Release: " + LivroDeLivraria.bookRelease);
		/*try {
			dateRelease = new SimpleDateFormat("dd/MMMM/yyyy").parse(LivroDeLivraria.bookRelease);
			System.out.println("Release: " + dateRelease);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}*/
		
		
		
	}	
	
}
