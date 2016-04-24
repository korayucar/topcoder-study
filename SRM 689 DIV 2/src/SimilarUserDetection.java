public class SimilarUserDetection {
	
	public String haveSimilar(String[] handles) {

		for(int i = 0 ; i < handles.length ; i ++)
		{
			for(int j = 0 ; j < handles[i].length() ; j++)
			{
				char c = handles[i].charAt(j) ;
				if(c == '0')
					handles [ i] = handles[i].substring(0,j) + "O" + handles[i].substring(j+1);
				if(c == '1' || c == 'I')
					handles [ i] = handles[i].substring(0,j) + "l" + handles[i].substring(j+1);
			}
		}

		for(int i = 0 ; i < handles.length ; i ++)
		{
			for(int j = i+1 ; j < handles.length ; j ++)
			{
				if(handles[i].equals(handles[j]))
					return "Similar handles found";
			}
		}
		return "Similar handles not found";
	}
}
