package com.te.codetest.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProject {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		List<Song> arrayList = new ArrayList<Song>();
		arrayList.add(new Song(1, "Tum Hi Ho", "Arijit Singh", "Aashique2", "Hindi Collection", "Love Song"));
		arrayList.add(new Song(2, "Milne Aa", "Arijit Singh", "Aashique2", "Hindi Collection", "Breakup Song"));
		arrayList
				.add(new Song(3, "Thathaka Theithare", "Prithviraj", "Hridayam", "Malayalam Collection", "Dance Song"));
		arrayList.add(new Song(4, "Manasse", "Vineeth Srinivasan", "Hridayam", "Malayalam Collection", "Love Song"));
		arrayList.add(new Song(5, "Come On Girls", "Dhanush", "3", "Tamil Collection", "Breakup Song"));
		arrayList.add(new Song(6, "Kannazhaga", "Dhanush", "3", "Tamil Collection", "Love Song"));
		arrayList.add(new Song(7, "Raamulo", "Sid Sriram", "Vaikuntapuramulo", "Telugu Collection", "Dance Song"));
		arrayList
				.add(new Song(8, "Saamajargamana", "Sid Sriram", "Vaikuntapuramulo", "Telugu Collection", "Love Song"));
		arrayList.add(new Song(9, "Hit On the Floor", "Sean Paul", "Paris", "English Collection", "Dance Song"));
		arrayList.add(new Song(10, "Baby", "Justin Bieber", "London", "English Collection", "Love Song"));

		int a;
		Scanner scanner = new Scanner(System.in);

		int k = 0;
		while (k != 1) {
			System.out.println();
			System.out.println("Welcome to Music Player!");
			System.out.println("------------------------");
			System.out.println("Press 1 to Play a Song");
			System.out.println("Press 2 to Search a Song");
			System.out.println("Press 3 to Show All Songs");
			System.out.println("Press 4 to Operate on List of Songs");
			System.out.println("Press 5 to Exit");
			System.out.println("Please enter your option:");

			a = scanner.nextInt();

			switch (a) {
			case 1: {
				String c;

				System.out.println("Press A to Play All Songs");
				System.out.println("Press B to Play Songs Randomly");
				System.out.println("Press C to Play a Particular Song");
				System.out.println("Please Enter the option:");

				c = scanner.next();

				switch (c) {
				case "A": {
//					arrayList.forEach(System.out::println);
					for (Song song : arrayList) {
						System.out.println(song.getSongTitle());
						Thread.sleep(2000);
					}
					break;
				}

				case "B": {
					Random random = new Random();
					int randomint = random.nextInt(arrayList.size());
					System.out.println(arrayList.get(randomint).toString());
					break;
				}

				case "C": {
					for (Song song : arrayList) {
						System.out.println(song.getSongID()+". "+song.getSongTitle());
					}
					System.out.println("Please enter a SongID");
					int b;
					b = scanner.nextInt();
					System.out.println(arrayList.get(b - 1));
					break;
				}

				default:
					System.out.println("Invalid Input!");
				}
				break;
			}

			case 2: {
				String d;
				int flag = 0;
				System.out.println("Enter the name of the Song:");
				scanner.nextLine();
				d = scanner.nextLine();
				int x = 0;
				for (int i = 0; i < arrayList.size(); i++) {
					if ((arrayList.get(i).getSongTitle().equalsIgnoreCase(d))) {
						System.out.println(arrayList.get(i).toString());
						flag = 1;
						x = i;
					}
				}
				if (flag == 1)
					System.out.println("The Song ID " + (x + 1) + " is the Key to play this Song");
				else
					System.out.println("No song with " + d + " is found");
				break;
			}

			case 3: {
				System.out.println("The Whole List Of Songs Is:");
				List<Song> collect = arrayList.stream().sorted(Comparator.comparing(Song::getSongTitle))
						.collect(Collectors.toList());

				for (Song song : collect) {
					System.out.println(song.getSongTitle());
					Thread.sleep(2000);
				}
//				 List<Song> list = new ArrayList(arrayList);
//				list.stream().sorted(Comparator.comparing(Song::getSongTitle));
//				for (Song song : list) {
//					System.out.println(song.getSongTitle());
//				}
				break;
			}

			case 4: {
				String e;

				System.out.println("Press A to Add A New Song");
				System.out.println("Press B to Edit an Existing Song");
				System.out.println("Press C to Delete an Existing Song");
				System.out.println("Please Enter the option:");

				e = scanner.next();
				switch (e) {
				case "A": {
					int songID;
					String songTitle, artistName, albumName, songLocation, description;
					songID = arrayList.size() + 1;
					System.out.println("Enter the Song Title:");
					scanner.nextLine();
					songTitle = scanner.nextLine();
					System.out.println("Enter the Artist Name:");
					artistName = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Enter the Album Name:");
					albumName = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Enter the Song Location:");
					songLocation = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Enter the Description:");
					description = scanner.nextLine();
					scanner.nextLine();
					arrayList.add(new Song(songID, songTitle, artistName, albumName, songLocation, description));
					System.out.println("New Song is Added as" + arrayList.get(arrayList.size() - 1));
					break;
				}

				case "B": {
					int g, h;

					System.out.println("The Enter the SongID which you want to Edit:");

					g = scanner.nextInt();

					System.out.println("1.Edit Song Name");
					System.out.println("2.Edit Artist Name");
					System.out.println("3.Edit Album Name");
					System.out.println("4.Edit Song Location");
					System.out.println("5.Edit Description");

					h = scanner.nextInt();

					switch (h) {
					case 1: {
						String name;

						System.out.println("Enter the Song Title");
						scanner.nextLine();
						name = scanner.nextLine();
						arrayList.get(g - 1).setSongTitle(name);
						break;
					}

					case 2: {
						String name;

						System.out.println("Enter the Artist Name");
						scanner.nextLine();
						name = scanner.nextLine();
						arrayList.get(g - 1).setArtistName(name);
						break;
					}

					case 3: {
						String name;

						System.out.println("Enter the Album Name");
						scanner.nextLine();
						name = scanner.nextLine();
						arrayList.get(g - 1).setAlbumName(name);
						break;
					}

					case 4: {
						String name;

						System.out.println("Enter the Song Location");
						scanner.nextLine();
						name = scanner.nextLine();
						arrayList.get(g - 1).setSongLocation(name);
						break;
					}

					case 5: {
						String name;

						System.out.println("Enter the Description");
						scanner.nextLine();
						name = scanner.nextLine();
						arrayList.get(g - 1).setDescription(name);
						break;
					}

					default:
						System.out.println("Invalid Input");
					}
					break;
				}

				case "C": {
					int f;

					System.out.println("Enter the Song ID of the Song you want to delete:");

					f = scanner.nextInt();
					int flag = 0;
					for (int i = 0; i < arrayList.size(); i++) {
						if (arrayList.get(i).getSongID() == f) {
							arrayList.remove(i);
							flag = 1;
						}
					}
					if (flag == 0) {
						System.out.println("There is no Song ID " + f);
					} else
						System.out.println("The Song ID " + f + " is successfully removed");
					break;
				}

				default:
					System.out.println("Invalid Input!");

				}
				break;
			}

			case 5: {
				k = 1;
				break;
			}

			default:
				System.out.println("Invalid Input!");
			}
		}
	}
}