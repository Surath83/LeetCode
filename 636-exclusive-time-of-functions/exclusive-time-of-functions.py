class Solution:
    def exclusiveTime(self, n: int, logs: List[str]) -> List[int]:
        res=[0]*n
        stack=[]
        prev_time=0
        for log in logs:
            fid,ty,time=log.split(":") 
            fid=int(fid)
            time=int(time)
            if ty=="start":
                if stack:
                    res[stack[-1]] += time - prev_time
                stack.append(fid)
                prev_time = time
            else:
                res[stack.pop()] += time - prev_time + 1
                prev_time = time + 1
        return res
