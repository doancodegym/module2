class test
{
    String s;
    int i, j, k, loi, saiSo;
    public test(String nhap)
    {
        s = nhap;
        saiSo = (int)Math.round(s.length() * 0.3);
    }
    public boolean SoSanh(String s1)
    {
        if (s1.length() < (s.length() - saiSo) || s1.length() > (s.length() + saiSo))
            return false;
        i = j = loi = 0;
        while (i < s.length() && j < s1.length()) {
            if (s[i] != s1[j]) {
                loi++;
                for (k = 1; k <= saiSo; k++)
                {
                    if ((i + k < s.length()) && s[i + k] == s1[j])
                    {
                        i += k;
                        loi += k - 1;
                        break;
                    }
                    else if ((j + k < s1.Length) && s[i] == s1[j + k])
                    {
                        j += k;
                        loi += k - 1;
                        break;
                    }
                }
            }
            i++;
            j++;
        }
        loi += s.Length - i + s1.Length - j;
        if (loi <= saiSo)
            return true;
        else return false;
    }
}