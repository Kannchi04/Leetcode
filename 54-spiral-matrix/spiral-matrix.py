class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        mat = []
        m = len(matrix)
        n = len(matrix[0])
        total = m*n
        c = 0
        rowStart = 0
        columnStart = 0
        columnEnd = n-1
        rowEnd = m-1
        while c<total: 
            #first row   
            
            for i in range (columnStart, columnEnd+1):
                mat.append(matrix[rowStart][i])
                c+=1
            rowStart+=1
            if c==total:
                break
            
            #last column
            for i in range(rowStart, rowEnd+1):
                mat.append(matrix[i][columnEnd])
                c+=1
            columnEnd-=1
            if c==total:
                break
            #last row

            for i in range(columnEnd, columnStart-1,-1):
                mat.append(matrix[rowEnd][i])
                c+=1
            rowEnd-=1
            if c==total:
                break
            
            #first column
            
            for i in range(rowEnd, rowStart-1, -1):
                mat.append(matrix[i][columnStart])
                c+=1
            columnStart+=1
            if c==total:
                break
          
        
        return mat
    


        