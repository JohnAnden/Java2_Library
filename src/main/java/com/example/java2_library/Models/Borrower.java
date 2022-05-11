package com.example.java2_library.Models;

import java.util.ArrayList;

    public class Borrower extends User {

        public Borrower(int idNum, String name, String address, int phoneNum) {
            super(idNum, name, address, phoneNum);
        }


        private ArrayList<Loan> borrowedBooks;

        borrowedBooks = new ArrayList();
        @Override
        public void printInfo()
        {
            super.printInfo();

            printBorrowedBooks();
        }

        private void printBorrowedBooks() {
            if (!borrowedBooks.isEmpty())
            {
                System.out.println("\nBorrowed Books are: ");
                System.out.println("No.\t\tTitle\t\t\tAuthor\t\t\tSubject");

                for (int i = 0; i < borrowedBooks.size(); i++)
                {
                    System.out.print(i + "-" + "\t\t");
                    borrowedBooks.get(i).getBook().printInfo();
                    System.out.print("\n");
                }
            }
            else
                System.out.println("\nNo borrowed books.");
        }
    }

}
