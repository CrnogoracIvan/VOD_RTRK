package com.example.ivancrnogorac.vod_rtrk.model;

import com.example.ivancrnogorac.vod_rtrk.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    public static List<Movie> setupMovies() {
        List<Movie> list = new ArrayList<>();

        String movies[] = {
                "The wolf of wall street",
                "Rush",
                "The Dark knight rises",
                "How to train your dragon 2",
                "The Expendables 3",
                "The amazing spider man 2",
                "22 jump street",
                "Guardians of the galaxy",
                "Maleficent",
                "Toy story 3",
                "Despicable me 2",
                "Space jam",
                "Godzilla",
                "What if",
                "Lets be cops"
        };

        String moviesImages[] = {
                "http://89.216.58.236/vod/posters/the_wolf_of_wall_street.jpg",
                "http://89.216.58.236/vod/posters/rush.jpg",
                "http://89.216.58.236/vod/posters/dark_knight_rises.jpg",
                "http://89.216.58.236/vod/posters/how_to_train_your_dragon_2.jpg",
                "http://89.216.58.236/vod/posters/the_expendables_3.jpg",
                "http://89.216.58.236/vod/posters/the_amazing_spider_man_2.jpg",
                "http://89.216.58.236/vod/posters/22_jump_street.jpg",
                "http://89.216.58.236/vod/posters/guardians_of_the_galaxy.jpg",
                "http://89.216.58.236/vod/posters/maleficent.jpg",
                "http://89.216.58.236/vod/posters/toy_story_3.jpg",
                "http://89.216.58.236/vod/posters/despicable_me_2.jpg",
                "http://89.216.58.236/vod/posters/space_jam.jpg",
                "http://89.216.58.236/vod/posters/godzilla.jpg",
                "http://89.216.58.236/vod/posters/what_if.jpg",
                "http://89.216.58.236/vod/posters/lets_be_cops.jpg"
        };

        String moviesBackgroundImages[] = {
                "http://89.216.58.236/vod/posters/the_wolf_of_wall_street_landscape.jpg",
                "http://89.216.58.236/vod/posters/rush_landscape.jpg",
                "http://89.216.58.236/vod/posters/dark_knight_rises_landscape.jpg",
                "http://89.216.58.236/vod/posters/how_to_train_your_dragon_2_landscape.jpg",
                "http://89.216.58.236/vod/posters/the_expendables_3_landscape.jpg",
                "http://89.216.58.236/vod/posters/the_amazing_spider_man_2_landscape.jpg",
                "http://89.216.58.236/vod/posters/22_jump_street_landscape.jpg",
                "http://89.216.58.236/vod/posters/guardians_of_the_galaxy_landscape.jpg",
                "http://89.216.58.236/vod/posters/maleficent_landscape.jpg",
                "http://89.216.58.236/vod/posters/toy_story_3_landscape.jpg",
                "http://89.216.58.236/vod/posters/despicable_me_2_landscape.jpg",
                "http://89.216.58.236/vod/posters/space_jam_landscape.jpg",
                "http://89.216.58.236/vod/posters/godzilla_landscape.jpg",
                "http://89.216.58.236/vod/posters/what_if_landscape.jpg",
                "http://89.216.58.236/vod/posters/lets_be_cops_landscape.jpg"
        };

        String moviesTrailers[] = {
                "http://89.216.58.236/vod/trailers/the_wolf_of_wall_street_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/rush_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/the_dark_knight_rises_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/how_to_train_your_dragon_2_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/the_expendables_3_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/the_amazing_spider_man_2_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/22_jump_street_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/guardians_of_the_galaxy_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/maleficent_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/toy_story_3_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/despicable_me_2_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/space_jam_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/godzilla_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/what_if_official_trailer.mp4",
                "http://89.216.58.236/vod/trailers/lets_be_cops_official_trailer.mp4"
        };

        String moviesUrls[] = {
                "http://www.imdb.com/title/tt0993846/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1979320/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1345836/?ref_=fn_al_tt_3",
                "http://www.imdb.com/title/tt1646971/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt2333784/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1872181/?ref_=fn_al_tt_3",
                "http://www.imdb.com/title/tt2294449/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt2015381/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1587310/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt0435761/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1690953/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt0117705/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt0831387/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1486834/?ref_=fn_al_tt_1",
                "http://www.imdb.com/title/tt1924435/?ref_=fn_al_tt_1"
        };

        String descriptions[] = {
                "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
                "The merciless 1970s rivalry between Formula One rivals James Hunt and Niki Lauda.",
                "Eight years after the Joker's reign of anarchy, the Dark Knight, with the help of the enigmatic Catwoman, is forced from his exile to save Gotham City, now on the edge of total annihilation, from the brutal guerrilla terrorist Bane.",
                "When Hiccup and Toothless discover an ice cave that is home to hundreds of new wild dragons and the mysterious Dragon Rider, the two friends find themselves at the center of a battle to protect the peace.",
                "Barney augments his team with new blood for a personal battle: to take down Conrad Stonebanks, the Expendables co-founder and notorious arms trader who is hell bent on wiping out Barney and every single one of his associates.",
                "When New York is put under siege by Oscorp, it is up to Spider-Man to save the city he swore to protect as well as his loved ones.",
                "After making their way through high school (twice), big changes are in store for officers Schmidt and Jenko when they go deep undercover at a local college.",
                "A group of intergalactic criminals are forced to work together to stop a fanatical warrior from taking control of the universe.",
                "A vengeful fairy is driven to curse an infant princess, only to discover that the child may be the one person who can restore peace to their troubled land.",
                "The toys are mistakenly delivered to a day-care center instead of the attic right before Andy leaves for college, and it's up to Woody to convince the other toys that they weren't abandoned and to return home.",
                "When Gru, the world's most super-bad turned super-dad has been recruited by a team of officials to stop lethal muscle and a host of Gru's own, He has to fight back with new gadgetry, cars, and more minion madness.",
                "In a desperate attempt to win a basketball match and earn their freedom, the Looney Tunes seek the aid of retired basketball champion, Michael Jordan.",
                "The world is beset by the appearance of monstrous creatures, but one of them may be the only one who can save humanity.",
                "Wallace, who is burned out from a string of failed relationships, forms an instant bond with Chantry, who lives with her longtime boyfriend. Together, they puzzle out what it means if your best friend is also the love of your life.",
                "Two struggling pals dress as police officers for a costume party and become neighborhood sensations. But when these newly-minted heroes get tangled in a real life web of mobsters and dirty detectives, they must put their fake badges on the line."
        };

        String actors[] = {
                "Leonardo DiCaprio, Jonah Hill, Margot Robbie, Matthew McConaughey",
                "Chris Hemsworth, Daniel Brühl, Olivia Wilde, Alexandra Maria Lara",
                "Christian Bale, Gary Oldman, Tom Hardy, Joseph Gordon-Levitt",
                "Jay Baruchel, Cate Blanchett, Gerard Butler, Craig Ferguson",
                "Sylvester Stallone, Jason Statham, Harrison Ford, Arnold Schwarzenegger, Mel Gibson, Wesley Snipes, Dolph Lundgren",
                "Andrew Garfield, Emma Stone, Jamie Foxx, Dane DeHaan",
                "Jonah Hill, Channing Tatum, Peter Stormare, Wyatt Russell",
                "Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel",
                "Angelina Jolie, Elle Fanning, Sharlto Copley, Lesley Manville",
                "Tom Hanks, Tim Allen, Joan Cusack, Ned Beatty, Don Rickles",
                "Steve Carell, Kristen Wiig, Benjamin Bratt, Miranda Cosgrove",
                "Michael Jordan, Wayne Knight, Theresa Randle, Manner Washington",
                "Aaron Taylor-Johnson, CJ Adams, Ken Watanabe, Bryan Cranston",
                "Daniel Radcliffe, Zoe Kazan, Megan Park, Megan Park",
                "Jake Johnson, Damon Wayans Jr., Rob Riggle, Nina Dobrev"
        };

        list.add(buildMovieInfo(movies[0], moviesImages[0], moviesBackgroundImages[0], moviesTrailers[0], descriptions[0], actors[0], moviesUrls[0]));
        list.add(buildMovieInfo(movies[1], moviesImages[1], moviesBackgroundImages[1], moviesTrailers[1], descriptions[1], actors[1], moviesUrls[1]));
        list.add(buildMovieInfo(movies[2], moviesImages[2], moviesBackgroundImages[2], moviesTrailers[2], descriptions[2], actors[2], moviesUrls[2]));
        list.add(buildMovieInfo(movies[3], moviesImages[3], moviesBackgroundImages[3], moviesTrailers[3], descriptions[3], actors[3], moviesUrls[3]));
        list.add(buildMovieInfo(movies[4], moviesImages[4], moviesBackgroundImages[4], moviesTrailers[4], descriptions[4], actors[4], moviesUrls[4]));
        list.add(buildMovieInfo(movies[5], moviesImages[5], moviesBackgroundImages[5], moviesTrailers[5], descriptions[5], actors[5], moviesUrls[5]));
        list.add(buildMovieInfo(movies[6], moviesImages[6], moviesBackgroundImages[6], moviesTrailers[6], descriptions[6], actors[6], moviesUrls[6]));
        list.add(buildMovieInfo(movies[7], moviesImages[7], moviesBackgroundImages[7], moviesTrailers[7], descriptions[7], actors[7], moviesUrls[7]));
        list.add(buildMovieInfo(movies[8], moviesImages[8], moviesBackgroundImages[8], moviesTrailers[8], descriptions[8], actors[8], moviesUrls[8]));
        list.add(buildMovieInfo(movies[9], moviesImages[9], moviesBackgroundImages[9], moviesTrailers[9], descriptions[9], actors[9], moviesUrls[9]));
        list.add(buildMovieInfo(movies[10], moviesImages[10], moviesBackgroundImages[10], moviesTrailers[10], descriptions[10], actors[10], moviesUrls[10]));
        list.add(buildMovieInfo(movies[11], moviesImages[11], moviesBackgroundImages[11], moviesTrailers[11], descriptions[11], actors[11], moviesUrls[11]));
        list.add(buildMovieInfo(movies[12], moviesImages[12], moviesBackgroundImages[12], moviesTrailers[12], descriptions[12], actors[12], moviesUrls[12]));
        list.add(buildMovieInfo(movies[13], moviesImages[13], moviesBackgroundImages[13], moviesTrailers[13], descriptions[13], actors[13], moviesUrls[13]));
        list.add(buildMovieInfo(movies[14], moviesImages[14], moviesBackgroundImages[14], moviesTrailers[14], descriptions[14], actors[14], moviesUrls[14]));

        return list;
    }

    private static Movie buildMovieInfo(String movies, String moviesImages, String moviesBackgroundImages, String moviesTrailers, String description, String actors, String moviesUrls) {
        Movie movie = new Movie();
        movie.setMovie(movies);
        movie.setImage(moviesImages);
        movie.setBgImage(moviesBackgroundImages);
        movie.setVideoUrl(moviesTrailers);
        movie.setDescription(description);
        movie.setActors(actors);
        movie.setUrl(moviesUrls);
        return movie;

    }
}
