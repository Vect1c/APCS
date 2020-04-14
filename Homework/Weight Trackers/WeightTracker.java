// a

public ArrayList<Double> getWeightChanges(ArrayList<Double> weights)
{
    ArrayList<Double> changes = new ArrayList<Double>();

    for (int j = 0; j =< weights.size() - 1; j++)
    {
        changes.add(weights.get(j + 1) - weights.get(j));
    }

    return changes;
}

// b

public ArrayList<Double> getWeights(double currentWeight, ArrayList<Double> weightChanges)
{
    ArrayList<Double> weights = new ArrayList<Double>();
    weights.add(currentWeight);
    
    for (double j : weightChanges)
    {
        currentWeight += j;
        weights.add(currentWeight);
    }
}

// c

public ArrayList<Double> getWeightRuns(ArrayList<Double> weights)
{
    ArrayList<Double> result = new ArrayList<Double>();
    
    int posInterval = 0, negInterval = 0, posTemp = 0, negTemp = 0;
    for(int i = 1; i < weights.size(); i++)
    {
        if (weights.get(i) - weights.get(i-1) >= 0)
        {
            posInterval++;
            posTemp = posInterval + 1;
        }
        else if (posTemp != posInterval)
        {
            result.add(weights.get(i - 1) - weights.get(i - posInterval - 1));
            posInterval = 0;
            posTemp = 0;
        }
        if (weights.get(i) - weights.get(i - 1) < 0)
        {
            negInterval++;
            negTemp = negInterval + 1;
        }
        
        else if(negTemp != negInterval)
        {
            result.add(weights.get(i - 1) - weights.get(i - negInterval - 1));
            negInterval = 0;
            negTemp = 0;
        }
        if (i == weights.size() - 1 && posInterval > 0)
            result.add(weights.get(i) - weights.get(i - posInterval));
        else if (i == weights.size() - 1 && negInterval > 0)
            result.add(weights.get(i) - weights.get(i - negInterval));
    }
    
    return result;
}
