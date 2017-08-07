/**
 * @Author Feng Bo
 * @Date 7 Aug 2017 2:29:26 pm
 */
package guru.springframework.joke.jokeapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * 
 */
@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guru.springframework.joke.jokeapp.services.JokeService#getJoke()
	 */
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
