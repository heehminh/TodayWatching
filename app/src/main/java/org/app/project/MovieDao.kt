package org.app.project

import androidx.room.*

@Dao
interface MovieDao {
    @Insert
    fun insert(movie: Movie)

    @Update
    fun update(movie: Movie)

    @Delete
    fun delete(movie: Movie)

    @Query("SELECT * FROM MovieTable")
    fun getMovies(): List<Movie>

    @Query("SELECT * FROM MovieTable WHERE id = :id")
    fun getMovie(id: Int?): Movie

    @Query("UPDATE MovieTable SET isLike= :isLike WHERE id = :id")
    fun updateIsLikeById(isLike: Boolean, id: Int)

    @Query("SELECT * FROM MovieTable WHERE isLike =:isLike")
    fun getLikedMovies(isLike: Boolean): List<Movie>
}