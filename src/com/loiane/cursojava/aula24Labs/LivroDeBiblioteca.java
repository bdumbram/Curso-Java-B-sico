package com.loiane.cursojava.aula24Labs;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LivroDeBiblioteca {

	public static void main(String[] args) throws ParseException {
		
		Book LivroDeBiblioteca = new Book();
		
		LivroDeBiblioteca.bookAuthor = "Dmitry Glukhovsky";
		LivroDeBiblioteca.bookCategory = "Science Fiction";
		LivroDeBiblioteca.bookFormat = "printed";
		LivroDeBiblioteca.bookName = "Metro 2033";
		LivroDeBiblioteca.bookPublisher = "Orion Publishing Group";
		LivroDeBiblioteca.bookRelease = "09/June/2011";
		LivroDeBiblioteca.bookBorrowed = true;
		LivroDeBiblioteca.bookBorrowDate = new Date();
		LivroDeBiblioteca.bookBorrowedTo = "Bruno";
		
		DateFormat format = new SimpleDateFormat("dd/MMMM/yyyy", Locale.ENGLISH);
		Date date = format.parse(LivroDeBiblioteca.bookRelease);		
		
		try {
			date = format.parse(LivroDeBiblioteca.bookRelease);
			String newDateString = format.format(date);
			System.out.println(date);			
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
