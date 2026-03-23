/*
IRepository.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 10 March 2026
*/

package za.ac.cput.repository;

public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}
