#!/usr/bin/env python
# coding: utf-8

# In[1]:


a = int(input())

for i in range(a):
    print(' ' * i, end = '')
    print('*' * ((a*2) - (i * 2 + 1)))


# In[ ]:




