package model;

import java.util.List;

public interface I_Genre<T> {
	 	public List<T> selectAll();
	 	public List<String> selectAllName();
	    public Genre selectById(int id);
	    public Genre selectByName(String name);
	    public boolean insert(Genre genre); ;
	    public boolean update(Genre genre);
	    public boolean delete(int id);
	   
}
