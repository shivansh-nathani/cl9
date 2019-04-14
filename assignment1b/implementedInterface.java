class Implemented implements inf{
    @Override
    public String add(String x,String y)
    {
        StringBuilder s = new StringBuilder(x);
        return s.append(y).toString();
    }

}