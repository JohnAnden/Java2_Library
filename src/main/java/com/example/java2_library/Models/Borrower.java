package com.example.java2_library.Models;

import java.util.ArrayList;

    public class Borrower extends User {
        private ArrayList <Loan> borrowedBooks = new ArrayList<>();

        public Borrower(int userId, String fName, String lName, int employeeNo) {
            super(userId, fName, lName, employeeNo);
        }

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

